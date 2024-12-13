package com.ib.client.service;

import com.ib.client.entity.User;
import com.ib.client.entity.VerificationToken;
import com.ib.client.module.UserModel;

import java.util.Optional;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);

    public String validateVerificationToken(String token);

    VerificationToken generateNewVerificationToken(String oldToken);

    User findUserByEmail(String email);

    void createPasswordResetTokenForUser(User user, String token);

    String validatePasswordResetToken(String token);

    Optional<User> getUserByPasswordResetToken(String token);

    void changePassword(User user, String newPassword);

    boolean checkIfOldPassword(User user, String oldPassword);
}
