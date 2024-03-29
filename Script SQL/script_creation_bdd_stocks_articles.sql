CREATE TABLE authentification(
  id_auth INTEGER GENERATED by default on null as IDENTITY(START with 1 INCREMENT BY 1),
  login_auth VARCHAR2(255),
  pass_auth VARCHAR2(255),
  util_auth INTEGER,
  CONSTRAINT pk_authentification PRIMARY KEY (id_auth)
  );
CREATE TABLE filiere (
  id_fil INTEGER GENERATED by default on null as IDENTITY(START with 1 INCREMENT BY 1),
  nom_fil VARCHAR2 (255),
  id_quota INTEGER,
  CONSTRAINT pk_filiere PRIMARY KEY (id_fil),
  CONSTRAINT fk_id_quota FOREIGN KEY (id_quota) REFERENCES quotaAbsence(id_quota)
);
CREATE TABLE groupe (
  id_gr INTEGER GENERATED by default on null as IDENTITY(START with 1 INCREMENT BY 1), 
  capa_max INTEGER,
  CONSTRAINT pk_groupe PRIMARY KEY (id_gr)
);
CREATE TABLE etudiant (
  id_et INTEGER GENERATED by default on null as IDENTITY(START with 1 INCREMENT BY 1),
  nom VARCHAR2 (255),
  prenom VARCHAR2 (255),
  email VARCHAR2 (255),
  id_filiere INTEGER,
  num_groupe INTEGER,
  penalite_absence NUMERIC,
  loginpass_et INTEGER, 
  CONSTRAINT pk_etudiant PRIMARY KEY (id_et),
  CONSTRAINT fk_num_groupe FOREIGN KEY (num_groupe) REFERENCES groupe(id_gr),
  CONSTRAINT fk_id_filiere FOREIGN KEY (id_filiere) REFERENCES filiere(id_fil),
  CONSTRAINT fk_loginpass_et FOREIGN KEY (loginpass_et) REFERENCES authentification(id_auth)
);
CREATE TABLE enseignant (
  id_ens INTEGER GENERATED by default on null as IDENTITY(START with 1 INCREMENT BY 1),
  nom VARCHAR2 (255),
  prenom VARCHAR2 (255),
  numTel VARCHAR2 (255),
  matiere VARCHAR2 (255),
  loginpass_ens INTEGER,  
  CONSTRAINT pk_enseignant PRIMARY KEY (id_ens),
  CONSTRAINT fk_loginpass_ens FOREIGN KEY (loginpass_ens) REFERENCES authentification(id_auth)
);
CREATE TABLE administration (
  id_adm INTEGER GENERATED by default on null as IDENTITY(START with 1 INCREMENT BY 1),
  nom VARCHAR2 (255),
  prenom VARCHAR2 (255),
  email VARCHAR2 (255),
  Loginpass_adm INTEGER,  
  CONSTRAINT pk_administration PRIMARY KEY (id_adm),
  CONSTRAINT fk_loginpass_adm FOREIGN KEY (loginpass_adm) REFERENCES authentification(id_auth)
);
CREATE TABLE gestionnaire (
  id_gest INTEGER GENERATED by default on null as IDENTITY(START with 1 INCREMENT BY 1),
  nom VARCHAR2 (255),
  prenom VARCHAR2 (255),
  email VARCHAR2 (255),
  Loginpass_gest INTEGER,  
  CONSTRAINT pk_gestionnaire PRIMARY KEY (id_gest),
  CONSTRAINT fk_loginpass_gest FOREIGN KEY (loginpass_gest) REFERENCES authentification(id_auth)
);
CREATE TABLE cours (
  id_co INTEGER GENERATED by default on null as IDENTITY(START with 1 INCREMENT BY 1),
  nom_co VARCHAR2 (255),
  nbHeure NUMBER,
  type VARCHAR2 (255),
  id_enseignant INTEGER,
  Id_groupe INTEGER,
  CONSTRAINT pk_cours PRIMARY KEY (id_co),
  CONSTRAINT fk_id_enseignant FOREIGN KEY (id_enseignant) REFERENCES enseignant(id_ens),
  CONSTRAINT fk_id_groupe FOREIGN KEY (id_groupe) REFERENCES groupe(id_gr)
);
CREATE TABLE typeAbsence(
  id_typeAbs INTEGER GENERATED by default on null as IDENTITY(START with 1 INCREMENT BY 1),
  nom_typeAbs VARCHAR2(255),
  date_typeAbs VARCHAR2(255),
  type_typeAbs VARCHAR2(255),
  justif_typeAbs NUMBER(1),
  CONSTRAINT pk_typeAbsence PRIMARY KEY (id_typeAbs)
);
CREATE TABLE absence(
  id_abs INTEGER GENERATED by default on null as IDENTITY(START with 1 INCREMENT BY 1),
  nom_abs VARCHAR2(255),
  id_etu INTEGER,
  date_abs VARCHAR2(255),
  id_type INTEGER,
  justif_abs NUMBER(1),
  CONSTRAINT pk_absence PRIMARY KEY (id_abs),
  CONSTRAINT fk_id_etu FOREIGN KEY (id_etu) REFERENCES etudiant(id_et),
  CONSTRAINT fk_id_type FOREIGN KEY (id_type) REFERENCES typeAbsence(id_typeAbs)
 );
CREATE TABLE quotaAbsence(
  id_quota INTEGER GENERATED by default on null as IDENTITY(START with 1 INCREMENT BY 1),
  nbH_quota INTEGER,
  penalite_quota NUMERIC,
  CONSTRAINT pk_quotaAbsence PRIMARY KEY (id_quota)
);
