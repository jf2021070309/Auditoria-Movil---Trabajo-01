import xml.etree.ElementTree as ET
import os
import sys
from os.path import join

def run(log, builder):
	def parse_strings(xml_file, property_name, app_id):

		try:
			with open(xml_file, 'r') as read_file:
				tree = ET.parse(read_file)
				root = tree.getroot()

				for child in root:
					name = child.get('name')
					if name == property_name:
						log.info('string %s = %s in %s' % (name, child.text, xml_file))
						child.text = app_id

				read_file.close()

			with open(xml_file, 'w+') as write_file:
				tree.write(write_file)
				write_file.close()

		except IOError as e:
			log.warning("{0}: I/O error({1}): {2}".format(xml_file, e.errno, e.strerror))

        fbSdkName = "FacebookSDK"
        try:
                if (builder.conf.custom.FacebookSDK_module_name != ""):
                        fbSdkName = builder.conf.custom.FacebookSDK_module_name
        except KeyError as e:
                log.debug("Using default facebook sdk module: {0}".format(fbSdkName))
	path_to_facebook = join("modules", fbSdkName, "res", "values", "strings.xml")
	facebook_id_property_name = 'facebook_app_id'

	try:
		parse_strings(path_to_facebook, facebook_id_property_name, builder.conf.custom.facebookAppId)
	except KeyError:
		pass
