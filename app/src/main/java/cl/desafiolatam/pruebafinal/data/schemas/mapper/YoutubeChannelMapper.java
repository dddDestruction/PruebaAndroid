package cl.desafiolatam.pruebafinal.data.schemas.mapper;

import cl.desafiolatam.pruebafinal.data.schemas.YouTubeChannelSchema;
import cl.desafiolatam.pruebafinal.domain.model.DomainModel;

public class YoutubeChannelMapper {

    public DomainModel mapSchmeToModel(YouTubeChannelSchema objeto){
        return new DomainModel(objeto.getNombre(), objeto.getType(), objeto.getDescripcion(), objeto.getVideoUrl(), objeto.getImageUrl(), objeto.getFecha());
    }
}
