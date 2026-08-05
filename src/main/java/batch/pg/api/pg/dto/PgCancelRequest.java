package batch.pg.api.pg.dto;

public record PgCancelRequest(
        long transactionId,
        long amount
) {
}
