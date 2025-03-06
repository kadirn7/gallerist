package com.kadirpasaoglu.service.Impl;

import org.springframework.stereotype.Service;

import com.kadirpasaoglu.exception.BaseException;
import com.kadirpasaoglu.exception.ErrorMessage;
import com.kadirpasaoglu.exception.MessageType;

import com.kadirpasaoglu.service.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService{

   

    public void test(){
        throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXİST,null));
    }
}
