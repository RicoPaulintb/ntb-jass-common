package ch.ntb.jass.common.proto.player_messages;

import ch.ntb.jass.common.entities.CardColor;
import ch.ntb.jass.common.entities.GameMode;
import ch.ntb.jass.common.proto.ToServerMessage;

/**
 * This Message is sent to the Server, it contains the information of the game mode
 * @param mode contains the gamemode
 * @param color contains the color the card with the chosen gamemode is "trumpf"
 */

public class ChosenTrumpMessage extends ToServerMessage {
    public GameMode mode;
    public CardColor color;
}
