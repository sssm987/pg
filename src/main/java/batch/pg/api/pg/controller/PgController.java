package batch.pg.api.pg.controller;

import batch.pg.api.pg.dto.PgApproveRequest;
import batch.pg.api.pg.dto.PgApproveResponse;
import batch.pg.application.pg.service.PgService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pg")
@RequiredArgsConstructor
@Tag(name = "PG API")
public class PgController {

    private final PgService pgService;

    @PostMapping("/approve")
    public PgApproveResponse approve(
            @RequestBody PgApproveRequest request
    ) {
        return pgService.approve(request);
    }

}
