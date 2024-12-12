import android.content.Context
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor
import io.flutter.plugins.GeneratedPluginRegistrant

class FlutterSingleton {
    companion object {
        val instance = FlutterSingleton()
    }

    var flutterEngine: FlutterEngine? = null
    fun startEngine(context: Context) {
        flutterEngine = FlutterEngine(context)
        flutterEngine!!.dartExecutor
            .executeDartEntrypoint(DartExecutor.DartEntrypoint.createDefault())
        FlutterEngineCache.getInstance()
            .put("my_engine_id", flutterEngine)
        GeneratedPluginRegistrant.registerWith(flutterEngine!!)
    }

}

