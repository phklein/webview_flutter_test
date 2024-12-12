package com.example.minimal_integration_test

import FlutterSingleton
import android.content.Context
import io.flutter.embedding.android.FlutterFragment
import io.flutter.embedding.engine.FlutterEngine

class FlutterFragmentTest : FlutterFragment() {
    @Override
    override fun provideFlutterEngine(context: Context): FlutterEngine? {
        return FlutterSingleton.instance.flutterEngine!!
    }
}