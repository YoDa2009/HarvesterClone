package de.yoda.harvesterclone.controller.viewcontroller;

import de.yoda.harvesterclone.controller.view.View;

/**
 * Created by yoda on 09.03.16.
 */
public abstract class ViewController
{
	protected View view;

	public View getView()
	{
		return view;
	}

	public void setView(View view)
	{
		this.view = view;
		initView();
	}

	public abstract void initView();
}
