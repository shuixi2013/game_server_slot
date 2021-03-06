package com.gameserver.recharge.msg;

import java.util.HashMap;
import java.util.Map;

import com.gameserver.common.msg.MessageType;
import com.common.MessageMappingProvider;

/**
 *  Generated by MessageCodeGenerator,don't modify please.
 *  Need to register in<code>GameMessageRecognizer#init</code>
 */
public class RechargeMsgMappingProvider implements MessageMappingProvider {

	@Override
	public Map<Short, Class<?>> getMessageMapping() {
		Map<Short, Class<?>> map = new HashMap<Short, Class<?>>();
		map.put(MessageType.CG_REQUEST_ORDER, CGRequestOrder.class);
		map.put(MessageType.CG_REQUEST_ORDER_MYCARD, CGRequestOrderMycard.class);
		map.put(MessageType.CG_VALIDATE_ORDER_MYCARD, CGValidateOrderMycard.class);
		map.put(MessageType.CG_REQUEST_ORDER_MOL, CGRequestOrderMol.class);
		map.put(MessageType.CG_VALIDATE_ORDER_MOL, CGValidateOrderMol.class);
		map.put(MessageType.CG_ORDER_AMAZON, CGOrderAmazon.class);
		map.put(MessageType.CG_ORDER_AMAZON_DELIVERY, CGOrderAmazonDelivery.class);
		map.put(MessageType.CG_VALIDATE_ORDER, CGValidateOrder.class);
		map.put(MessageType.CG_COUPON_EXIST, CGCouponExist.class);
		return map;
	}

}
