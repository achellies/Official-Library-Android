package com.bluevia.android.messagery.mo.data;

import java.util.ArrayList;

import com.bluevia.android.commons.Entity;

/**
 * 
 * Class representing the ReceivedMessageList that will be received using the SMS/MMS Client API
 * This type is composed of the following fields:
 * <ul>
 * <li>List</li>
 * </ul>
 *
 * This implementation is not synchronized
 *
 * @author Telefonica R&D
 *
 */
public class ReceivedMessageList implements Entity {

    private ArrayList<AbstractReceivedMessage> mList;

    /**
     *  Instantiates a new ReceivedSmsList
     */
    public ReceivedMessageList(){
    	super();
    	mList = new ArrayList<AbstractReceivedMessage>();
    }
    
    public boolean isValid() {
		for (AbstractReceivedMessage message : mList){
			if (!message.isValid())
				return false;
		}
		return true;
	}
    /**
     * Adds a new single received Message
     * @param element
     * @return
     */
    public boolean add(AbstractReceivedMessage element){
        return mList.add(element);
    }

    /**
     * Return the received Message list for all recipient addresses
     * @param <E>
     * @return the list
     */
    @SuppressWarnings("unchecked")
	public <E> ArrayList<E> getList()  {
        return (ArrayList<E>)mList.clone();
    }

}
