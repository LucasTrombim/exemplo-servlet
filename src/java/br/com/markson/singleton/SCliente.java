/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.markson.singleton;

import br.com.markson.objeto.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author markson
 */
public class SCliente {
   private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
   
   
    
    private SCliente() {
    }
    
    public static SCliente getInstance() {
        return SClienteHolder.INSTANCE;
    }
    
    private static class SClienteHolder {

        private static final SCliente INSTANCE = new SCliente();
    }
}
