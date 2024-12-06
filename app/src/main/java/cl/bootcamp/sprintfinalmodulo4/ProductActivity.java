package cl.bootcamp.sprintfinalmodulo4;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import cl.bootcamp.sprintfinalmodulo4.databinding.ActivityProductBinding;


public class ProductActivity extends AppCompatActivity{

    private ActivityProductBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProductBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupWebView();

        binding.btnBack.setOnClickListener(v -> onBackPressed());
    }

    private void setupWebView() {
        binding.webView.setWebViewClient(new WebViewClient());
        binding.webView.loadUrl("https://www.example.com");
    }
}