package com.tns.gen.com.google.android.gms.tasks;

public class OnSuccessListener implements com.google.android.gms.tasks.OnSuccessListener {
	public OnSuccessListener() {
		com.tns.Runtime.initInstance(this);
	}

	public void onSuccess(java.lang.Object param_0)  {
		java.lang.Object[] args = new java.lang.Object[1];
		args[0] = param_0;
		com.tns.Runtime.callJSMethod(this, "onSuccess", void.class, args);
	}

}
