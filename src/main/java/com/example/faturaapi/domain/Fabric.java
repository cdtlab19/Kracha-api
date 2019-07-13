package com.example.faturaapi.domain;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Fabric {

    private FabricConnection fabricConnection;
    private FabricNetwork fabricNetwork;

    public Fabric(FabricConnection fabricConnection, FabricNetwork fabricNetwork) {
        this.fabricConnection = fabricConnection;
        this.fabricNetwork = fabricNetwork;
    }

    public FabricConnection getFabricConnection() {
        return fabricConnection;
    }

    public FabricNetwork getFabricNetwork() {
        return fabricNetwork;
    }
}
