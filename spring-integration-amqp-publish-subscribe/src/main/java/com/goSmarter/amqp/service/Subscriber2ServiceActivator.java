package com.goSmarter.amqp.service;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.integration.message.GenericMessage;

public class Subscriber2ServiceActivator {

	private static Log logger = LogFactory
			.getLog(Subscriber2ServiceActivator.class);

	public void logXml(GenericMessage<?> msg) throws Exception {
		logger.debug("### PAYLOAD ###" + msg.getPayload());
	}
}
