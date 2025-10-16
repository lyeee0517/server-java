package kr.hhplus.be.server.util.exception;

public record ErrorResponse(
    String code,
    String message
) {
}
