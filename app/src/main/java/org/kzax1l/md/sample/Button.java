package org.kzax1l.md.sample;

import android.content.Context;
import android.util.AttributeSet;

import com.rey.material.drawable.RippleDrawable;

import org.kzax1l.md.R;

/**
 * Created by Administrator on 2017-05-27.
 *
 * @author kzaxil
 */
public class Button extends android.widget.Button {
    public Button(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackground(new RippleDrawable.Builder(context, R.style.ButtonStyle).build());
    }
}
