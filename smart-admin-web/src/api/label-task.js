import { postAxios, getAxios, postDownloadAxios } from '@/lib/http';
export const labelTaskApi = {
  queryLabelTask: (data) => {
    return postAxios('/labelTask/page/query', data);
  }
}
;
