package com.mapbox.mapboxsdk.testapp.activity;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Style;
import com.mapbox.mapboxsdk.testapp.activity.espresso.EspressoTestActivity;

import androidx.annotation.UiThread;


/**
 * Base class for all tests using EspressoTestActivity as wrapper.
 * Testes in sub classes will be executed on App center
 * <p>
 * Loads "assets/streets.json" as style.
 * </p>
 */
public class EspressoAppCenterTest extends BaseAppCenterTest {

  @Override
  protected final Class getActivityClass() {
    return EspressoTestActivity.class;
  }

  @UiThread
  @Override
  protected void initMap(MapboxMap mapboxMap) {
    mapboxMap.setStyle(new Style.Builder().fromUri("asset://streets.json"));
    super.initMap(mapboxMap);
  }
}
