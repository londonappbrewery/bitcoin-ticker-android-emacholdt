package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitCoinTickerModel {
    // TODO: Declare the member variables here
    private String mValue;

    // TODO: Create a WeatherDataModel from a JSON:
    public static BitCoinTickerModel fromJson(JSONObject jsonObject){
        try {
            BitCoinTickerModel bitCoinData = new BitCoinTickerModel();
            bitCoinData.mValue = jsonObject.getString("ask");


            return bitCoinData;
        } catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public String getValue() {
        return mValue;
    }
}
