package com.coffee.service.feedback;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import com.coffee.model.feedback.Feedback;

public interface IFeedbackService {
    /**
     * Created by: DiepTT
     * Date created: 09/08/2022
     * Function: Create feedback (User send feedback)
     */
    void createFeedback(Feedback feedback);

    /**
     * Created by : LuanTV
     * Date created: 09/08/2022
     * function: page section, search
     *
     * @param pageable
     * @param creator
     * @param feedbackDate
     * @return
     */
    Page<Feedback> findAllFeedback(Pageable pageable, String creator, String feedbackDate);

    /**
     * Created by : LuanTV
     * Date created: 09/08/2022
     * function: find by id feedback
     *
     * @param id
     * @return
     */

    Optional<Feedback> findFeedbackById(int id);



}