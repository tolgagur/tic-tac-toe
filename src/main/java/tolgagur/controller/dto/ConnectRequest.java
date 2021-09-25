package tolgagur.controller.dto;

import lombok.Data;
import tolgagur.model.Player;

@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}
