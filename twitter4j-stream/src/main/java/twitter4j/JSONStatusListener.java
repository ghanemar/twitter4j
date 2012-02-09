//package edu.uc.acsl.twitter;
package twitter4j;

import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StreamListener;
import twitter4j.internal.org.json.JSONObject;

/**
 * JSONStatusListener is an interface which will allow return raw stream in the form of JSON.
 * 
 * This class is slightly modified version of StatusListener authored by Yusuke Yamamoto - yusuke at mac.com
 * 
 * Changed methods from the original form are
 * 
 * public abstract void onStatus(JSONObject json);
 *
 * @author Amer Ghanem - amer@ghanem.ps
 * 
 */

public interface JSONStatusListener extends StreamListener {
	

    public abstract void onStatus(JSONObject json);

    public abstract void onDeletionNotice(StatusDeletionNotice statusdeletionnotice);

    public abstract void onTrackLimitationNotice(int i);

    public abstract void onScrubGeo(long l, long l1);
}
