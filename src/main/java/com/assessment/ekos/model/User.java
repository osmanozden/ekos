package com.assessment.ekos.model;import lombok.AllArgsConstructor;import lombok.Data;import lombok.EqualsAndHashCode;import lombok.NoArgsConstructor;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.Table;import javax.persistence.UniqueConstraint;@NoArgsConstructor@AllArgsConstructor// @EqualsAndHashCode(callSuper = true)@Data@Entity@Table(        name = "ekos_user",        uniqueConstraints = {                @UniqueConstraint(                        name = "email",                        columnNames = {"email"}),        })public class User {        @Column(name = "email")        private String email;        @Column(name = "password")        private String password;        @Column(name = "firstname")        private String firstName;        @Column(name = "lastname")        private String lastName;}