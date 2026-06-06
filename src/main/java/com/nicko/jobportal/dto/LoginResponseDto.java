package com.nicko.jobportal.dto;

public record LoginResponseDto(String message, UserDto user, String jwtToken) {
}
