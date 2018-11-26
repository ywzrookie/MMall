package sign;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.util.Patterns;
import android.view.View;

import com.late.core.fragments.LatteFragment;
import com.late.core.net.RestClient;
import com.late.core.net.callback.ISuccess;
import com.latte.ec.R;
import com.latte.ec.R2;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by ywz on 18-11-26.
 * Describe:
 */
public class SignUpFragment extends LatteFragment {

    @BindView(R2.id.edit_registered_name)
    TextInputEditText mName = null;
    @BindView(R2.id.edit_registered_email)
    TextInputEditText mEmail = null;
    @BindView(R2.id.edit_registered_phone)
    TextInputEditText mPhone = null;
    @BindView(R2.id.edit_registered_password)
    TextInputEditText mPassword = null;
    @BindView(R2.id.edit_registered_password_confirm)
    TextInputEditText mPassWordConfirm = null;

    private ISignListener mISignListener = null;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof ISignListener) {
            mISignListener = (ISignListener) activity;
        }
    }

    @OnClick(R2.id.btn_registered)
    void onClickRegistered() {
        if (checkForm()) {
            RestClient.builder()
                    .url("http://mock.fulingjie.com/mock/data/user_profile.json")
                    .params("name", mName.getText().toString())
                    .params("email", mEmail.getText().toString())
                    .params("phone", mPhone.getText().toString())
                    .params("password", mPassword.getText().toString())
                    .success(new ISuccess() {
                        @Override
                        public void onSuccess(String response) {
                            SignHandler.onSignUp(response, mISignListener);
                        }
                    })
                    .build()
                    .post();
        }
    }

    @OnClick(R2.id.tv_link_sign_in)
    void onClickLink() {
        start(new SignInFragment());
    }

    private boolean checkForm() {
        final String name = mName.getText().toString();
        final String email = mEmail.getText().toString();
        final String phone = mPhone.getText().toString();
        final String password = mPassword.getText().toString();
        final String passwordConfirm = mPassWordConfirm.getText().toString();

        boolean isPass = true;

        if (name.isEmpty()) {
            mName.setError("请输入姓名");
            isPass = false;
        } else {
            mName.setError(null);
        }

        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            mEmail.setError("错误的邮箱格式");
            isPass = false;
        } else {
            mEmail.setError(null);
        }

        if (phone.isEmpty() || phone.length() != 11) {
            mPhone.setError("手机号码错误");
            isPass = false;
        } else {
            mPhone.setError(null);
        }

        if (password.isEmpty() || password.length() < 6) {
            mPassword.setError("请填写至少6位数密码");
            isPass = false;
        } else {
            mPassword.setError(null);
        }

        if (passwordConfirm.isEmpty() || passwordConfirm.length() < 6 || !passwordConfirm.equals(password)) {
            mPassWordConfirm.setError("密码验证错误");
            isPass = false;
        } else {
            mPassWordConfirm.setError(null);
        }

        return isPass;

    }

    @Override
    public Object setLayout() {
        return R.layout.fragment_sign_up;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }
}
