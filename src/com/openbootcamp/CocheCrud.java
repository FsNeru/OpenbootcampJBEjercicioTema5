package com.openbootcamp;

import java.util.List;

public interface CocheCrud {

    void saveCocheCrud(CocheCrudImpl cocheCrudImpl);

    List<CocheCrudImpl> findAll();

    void delete(CocheCrudImpl cocheCrudImpl);


}
