import { postAxios, getAxios, postDownloadAxios } from '@/lib/http';
export const labelProjectApi = {
  queryLabelProject: (data) => {
    return postAxios('/labelProject/page/query', data);
  }
}
;
