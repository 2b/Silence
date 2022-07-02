package me.lucky.silence

import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

class TileService : TileService() {
    private lateinit var prefs: Preferences

    override fun onCreate() {
        super.onCreate()
        prefs = Preferences(this)
    }

    override fun onClick() {
        super.onClick()
        val state = qsTile.state == Tile.STATE_INACTIVE
        prefs.isEnabled = state
        Utils.updateSmsReceiverState(this, prefs)
        update()
    }

    override fun onStartListening() {
        super.onStartListening()
        update()
    }

    private fun update() {
        qsTile.state = when {
            !Utils.hasCallScreeningRole(this) -> Tile.STATE_UNAVAILABLE
            prefs.isEnabled -> Tile.STATE_ACTIVE
            else -> Tile.STATE_INACTIVE
        }
        qsTile.updateTile()
    }
}
