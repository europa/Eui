// Generated code from Butter Knife. Do not modify!
package com.europa.eui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class CheckActivity$$ViewInjector<T extends com.europa.eui.activity.CheckActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2130968582, "field 'demoChk'");
    target.demoChk = finder.castView(view, 2130968582, "field 'demoChk'");
  }

  @Override public void reset(T target) {
    target.demoChk = null;
  }
}
