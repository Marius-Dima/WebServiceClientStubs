import stubs.GlobalWeather
import stubs.GlobalWeatherLocator
import stubs.GlobalWeatherSoap_PortType


GlobalWeather globalWeather = new GlobalWeatherLocator()
GlobalWeatherSoap_PortType globalWeatherSoap = globalWeather.getGlobalWeatherSoap()

def xmlResponse = globalWeatherSoap.getWeather("Bucuresti", "Romania")

def parsedXML = new XmlSlurper().parseText(xmlResponse)
assert parsedXML.Status == "Success"





