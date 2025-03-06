package com.kadirpasaoglu.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageType {
    NO_RECORD_EXİST("1004","Kayıt bulunamadı"),
    GENERAL_EXCEPTION("9999","Genel bir hata oluştu");

    private String code;
    private String message;


}
