package Network;

import model.Objects;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by THANHHUNGPHAT on 16/06/2016.
 */
public interface ApiInterface {
    @GET("users")
    Call<Objects> getInforMation();
}
