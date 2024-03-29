package com.nofriend.sonmandube.chat.domain;

public interface ChatProjection {
    Long getChatId();
    String getMessage();
    String getCreateTime();
    MemberProjection getMember();

    HandwritingProjection getHandwriting();

    interface MemberProjection {
        Long getMemberId();
        String getNickname();

        boolean isBadge();

        String getImageUrl();
    }


    interface HandwritingProjection {
        Long getHandwritingId();
        String getName();
        String getDownloadUrl();
    }
}