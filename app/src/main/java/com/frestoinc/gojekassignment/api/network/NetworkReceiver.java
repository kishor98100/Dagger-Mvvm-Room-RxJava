package com.frestoinc.gojekassignment.api.network;

/**
 * Created by frestoinc on 31,January,2020 for GoJekAssignment.
 */
public interface NetworkReceiver {

  void onNetworkStateChanged(boolean connected);
}
