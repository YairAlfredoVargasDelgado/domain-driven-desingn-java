package com.numbers.onlinestore.infrastructure.data.repositories;

import com.numbers.onlinestore.infrastructure.data.UnitOfWork;

public class OnlineStoreContract {
    
    public OnlineStoreContract() {
        UnitOfWork.addRepository(new ClienteRepository());
    }

}