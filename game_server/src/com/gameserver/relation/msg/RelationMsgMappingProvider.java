package com.gameserver.relation.msg;

import java.util.HashMap;
import java.util.Map;

import com.gameserver.common.msg.MessageType;
import com.common.MessageMappingProvider;

/**
 *  Generated by MessageCodeGenerator,don't modify please.
 *  Need to register in<code>GameMessageRecognizer#init</code>
 */
public class RelationMsgMappingProvider implements MessageMappingProvider {

	@Override
	public Map<Short, Class<?>> getMessageMapping() {
		Map<Short, Class<?>> map = new HashMap<Short, Class<?>>();
		map.put(MessageType.CG_LOAD_FRIEND_LIST, CGLoadFriendList.class);
		map.put(MessageType.CG_LOAD_FRIEND_REQUEST_LIST, CGLoadFriendRequestList.class);
		map.put(MessageType.CG_REQUEST_FRIEND, CGRequestFriend.class);
		map.put(MessageType.CG_APPLY_FRIEND, CGApplyFriend.class);
		map.put(MessageType.CG_DELETE_FRIEND, CGDeleteFriend.class);
		map.put(MessageType.CG_LOAD_FRIEND_GIFT_LIST, CGLoadFriendGiftList.class);
		map.put(MessageType.CG_FRIEND_GIFT, CGFriendGift.class);
		map.put(MessageType.CG_FRIEND_GIFT_GET, CGFriendGiftGet.class);
		map.put(MessageType.CG_FACEBOOK_FRIENDS_SYNC, CGFacebookFriendsSync.class);
		map.put(MessageType.CG_FACEBOOK_NUM, CGFacebookNum.class);
		map.put(MessageType.CG_STRANGER_LIST, CGStrangerList.class);
		map.put(MessageType.CG_ENTER_FRIENDS_ROOM, CGEnterFriendsRoom.class);
		return map;
	}

}