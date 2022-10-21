import groovy.json.JsonSlurper

def jsonSlurper = new JsonSlurper()

def config = jsonSlurper.parse(new File('config.json'))
println "$config.arm_info.DiskInfo"
