USE CLINICA;

CREATE VIEW MEDICOS_ESPECIALIDADE_CARDIOLOGIA(NOMEMED, NUMEROCRM, ESTADOCRM)
	AS SELECT M.NOMEMED, M.NUMEROCRM, M.ESTADOCRM FROM MEDICO M, POSSUIESPECIALIDADE PE
		WHERE M.NUMEROCRM = PE.NUMEROCRM AND PE.IDESPECIALIDADE = 1;
        
SELECT * FROM PACIENTE WHERE NOMEPACIENTE LIKE '%OS%';