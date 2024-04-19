package talonos.biomescanner.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import talonos.biomescanner.map.MapScanner;

public class UpdateClientMapHandler implements IMessageHandler<UpdateMapPacket, IMessage> {

    @Override
    public IMessage onMessage(UpdateMapPacket message, MessageContext ctx) {
        MapScanner.instance.updateFromNetwork(
            message.getMapX(),
            message.getMapY(),
            message.getUpdateWidth(),
            message.getUpdateHeight(),
            message.getUpdateData());
        return null;
    }
}
