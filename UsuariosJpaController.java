/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Cliente
 */
public class UsuariosJpaController {
    public static void findUsuario (string login, password senha){
        return (root, criteriaQuery, criteriaBuilder)=> login, senha == null ? null
                : criteriaBuilder.like(root.get("login, senha"), login, senha)}
    
}
