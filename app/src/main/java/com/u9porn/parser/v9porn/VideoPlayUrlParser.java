package com.u9porn.parser.v9porn;

import com.u9porn.data.db.entity.VideoResult;
import com.u9porn.data.model.User;

public interface VideoPlayUrlParser {
    VideoResult parseVideoPlayUrl(String html, User user);
}
