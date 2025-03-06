package com.kadirpasaoglu.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    private MessageType messageType;
    private String ofStatic;
    

    public String prepareErrorMessage(){
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append(messageType.getMessage());
        if(this.ofStatic!=null){
            stringBuilder.append(""+ofStatic);
        }
        return stringBuilder.toString();
    }

    
    
}
