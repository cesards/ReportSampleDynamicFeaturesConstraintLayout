package com.google.android.samples.dynamicfeatures.ondemand

import android.os.Bundle
import com.google.android.samples.dynamicfeatures.BaseSplitActivity
import com.google.android.samples.dynamicfeatures.ondemand.kotlin.R

/** A simple Activity displaying some text, written in Kotlin. */
class DynamicSampleActivity : BaseSplitActivity() {

    /**
     * If we inflate the layout declared in the base module (:app) the Barriers work well. If we
     * inflate the same (mirrored) layout declared in this module that uses resources from base, the
     * barriers are broken.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_dynamic_sample)
        setContentView(R.layout.activity_dynamic_sample2)
    }
}
