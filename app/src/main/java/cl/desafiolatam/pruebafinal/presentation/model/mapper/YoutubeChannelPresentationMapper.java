package cl.desafiolatam.pruebafinal.presentation.model.mapper;

import cl.desafiolatam.pruebafinal.domain.model.DomainModel;
import cl.desafiolatam.pruebafinal.presentation.model.YouTubeChannelPresentationModel;

public class YoutubeChannelPresentationMapper {

    public YouTubeChannelPresentationModel mapSchmeToModel(DomainModel objeto){
        return new YouTubeChannelPresentationModel(objeto.getNombre(), objeto.getType(), objeto.getDescripcion(), objeto.getVideoUrl(), objeto.getImageUrl(), objeto.getFecha());
    }

}
