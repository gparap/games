/*******************************
 * Katocheánian Gaming Studios *
 * Little Jerry's Friends      *
 * created by gparap           *
 *******************************/
package gparap.games.falling.tokens

import com.badlogic.gdx.graphics.g2d.Sprite
import gparap.games.falling.GameConstants

class CoinToken(sprite: Sprite) : Token(sprite) {

    init {
        speed = 1.25F
        super.randomizeSpeed(GameConstants.TOKEN_COIN_MAX_SPEED)
        tokenType = TokenType.COIN
    }

    override fun isActiveInGame(): Boolean {
        return isActive
    }

    override fun setActiveInGame(active: Boolean) {
        isActive = active
    }

    override fun isCollectedInGame(): Boolean {
        return isCollected
    }

    override fun setCollectedInGame(collected: Boolean) {
        isCollected = collected
    }
}