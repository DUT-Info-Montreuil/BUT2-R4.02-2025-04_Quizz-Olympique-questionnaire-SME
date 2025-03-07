package org.univ_paris8.iut.montreuil.qdev.tp2025.gr4.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr4.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr4.jeuQuizz.services.interfaces.IQuestionnaireServices;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr4.jeuQuizz.utils.exceptions.ChargementFichierException;

import java.util.List;

public class QuestionnaireServicesImpl implements IQuestionnaireServices {
    @Override
    public List<QuestionnaireDTO> fournirListeQuestionnaire(String path) throws ChargementFichierException {
        return null;
    }
}
