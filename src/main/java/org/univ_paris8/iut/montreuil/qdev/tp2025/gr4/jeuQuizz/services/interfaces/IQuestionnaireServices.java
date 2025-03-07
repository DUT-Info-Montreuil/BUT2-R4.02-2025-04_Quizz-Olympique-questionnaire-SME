package org.univ_paris8.iut.montreuil.qdev.tp2025.gr4.jeuQuizz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr4.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr4.jeuQuizz.utils.exceptions.ChargementFichierException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr4.jeuQuizz.utils.exceptions.FichierCorrompuException;

import java.util.List;

public interface IQuestionnaireServices {
    List<QuestionnaireDTO> fournirListeQuestionnaire(String path) throws ChargementFichierException;
}
