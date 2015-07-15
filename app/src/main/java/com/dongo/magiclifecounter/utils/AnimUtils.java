package com.dongo.magiclifecounter.utils;

import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;

/**
 * Created by dongo on 15.07.2015.
 */
public class AnimUtils {

    public static AnimationSet moveHorizontallyFromRelPosition(float from, float to, int duration){

        AnimationSet as = new AnimationSet(true);
        as.setFillEnabled(true);
        as.setInterpolator(new BounceInterpolator());

        TranslateAnimation moveAnim = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, from,
                Animation.RELATIVE_TO_SELF, to,
                Animation.ABSOLUTE, 0,
                Animation.ABSOLUTE, 0);
        moveAnim.setDuration(duration);
        as.addAnimation(moveAnim);

        return as;
    }


}
