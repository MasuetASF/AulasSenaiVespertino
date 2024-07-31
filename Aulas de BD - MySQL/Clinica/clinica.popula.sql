-- ClinicaPopula

USE CLINICA;

INSERT INTO MEDICO(NUMEROCRM, ESTADOCRM, NOMEMED)
VALUES (854795,'GO','JOÃO JOSÉ'),
	   (587412, 'MG','MACHADO DE ASSIS');
       

INSERT INTO PACIENTE(NOMEPACIENTE, DATANASCIMENTO, SEXO, CEP, CIDADE, ESTADO, COMPLEMENTO)
VALUES ('MARCOS JOSE', '1968-03-16', 'M', 76583311, 'SAO PAULO', 'SP', 'VILA BELMIRO'),
	   ('MARCOS FELIPE', '1943-03-17', 'M', 76888311, 'RIO DE JANEIRO', 'RJ', 'MORRO DA PENHA');
       
INSERT INTO ESPECIALIDADE (NOMEESPECIALIDADE)
VALUES('CARDIOLOGISTA'),
	  ('ORTOPEDISTA'),
      ('PEDIATRA'),
      ('OTORRINONALINGOLOGISTA'),
      ('NEUROLOGISTA');  

INSERT INTO POSSUIESPECIALIDADE(IDESPECIALIDADE,NUMEROCRM,ESTADOCRM)
VALUES(1,587412,'DF'),
	  (2,587412,'DF'),
      (2,587412,'MG'),
      (3,587412,'MG');
      
      
INSERT INTO CONSULTA (DATAHORA, NUMEROCRM, ESTADOCRM,IDPACIENTE)
VALUES('2024-07-20 10:30:00', '587412', 'DF', 1),
	  ('2024-08-22 14:40:00', '854795', 'BA', 2);
       
INSERT INTO TELEFONE (TELEFONE, IDPACIENTE)
VALUES(61981753654,1),
	  (61988665544,1),
      (61977554466,2);
      
INSERT INTO TELEFONE (TELEFONE, IDPACIENTE)
VALUES(61977554466,1);


INSERT INTO MEDICAMENTOPRESCRITO(MEDICAMENTO, IDRECEITA)
VALUES('IBUPROFENO', 1),
	  ('NIMESULIDA', 2);
      
INSERT INTO RECEITA(IDCONSULTA,DESCRICAORECEITA)
VALUES(1,'TOMAR DE 8 EM 8 HORAS'),
	  (2,'');
      