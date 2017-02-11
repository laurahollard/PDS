/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tacos.dao;

import com.tacos2.Vehicule;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Class which represent a implementation of VehiculeDAO
 * @author hammadin hollardl
 */
public class VehiculeDAOImpl implements VehiculeDAO {
    /* Implémentation de la méthode trouver() définie dans l'interface UtilisateurDao */
	/**
	 * Instance of DAOFactory
	 */
    private final DAOFactory          daoFactory;
    
    /**
     * Instance of Connection to the database
     */
    private Connection connection;

    /**
     * Class contructor
     * @param daoFactory an instance of DAOFactory
     */
    public VehiculeDAOImpl( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    
    /**
     * Find a vehicle into the database
     * @param id The vehicle's id
     */
    public void find( int id ) throws DAOException {
        try {
            
            this.connection = daoFactory.getConnection();
            
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement ordre = null;
        try {
             ordre = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "select * from test where id = "+id;
      
        try {
           ResultSet rs = ordre.executeQuery(sql);
           while(rs.next()){
            int identifiant = rs.getInt(1);
            String provenance = rs.getString(2);
            Timestamp date = rs.getTimestamp(3);
            
            Vehicule v = new Vehicule(identifiant, provenance, date);
            System.out.println("id : "+identifiant+" provenance : "+provenance+" dateEntree : "+date+"\n");
           }
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            ordre.close();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    /**
     * Insert a vehicle into the database
     * @param id The vehicle's id
     */
    public void insert(int id) throws DAOException {
        try {
            
            this.connection = daoFactory.getConnection();
            
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement ordre = null;
        try {
             ordre = connection.createStatement();
             
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "INSERT INTO test (id, provenance, dateEntree) VALUES("+id+",'Paris', NOW())";
       
        try {
            ordre.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            ordre.close();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Update a vehicle into the database
     * @param id The vehicle's id
     */
    public void update(int id) throws DAOException {
        try {
            
            this.connection = daoFactory.getConnection();
            
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement ordre = null;
        try {
             ordre = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "UPDATE test SET provenance = 'Lyon' where id = "+id;
      
        try {
            ordre.executeUpdate(sql);
          
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            ordre.close();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Delete a vehicle from the database
     * @param id The vehicle's id
     */
    public void delete(int id) throws DAOException {
        try {
            
            this.connection = daoFactory.getConnection();
            
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement ordre = null;
        try {
             ordre = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "DELETE from test where id = "+id;
      
        try {
            ordre.executeUpdate(sql);
          
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            ordre.close();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

